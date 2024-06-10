DOCKER_IMAGE = "openapitools/openapi-generator-cli:v7.2.0"
GENERATED_DIR = "generated"
GENERATED_DIR_JAVA = $(GENERATED_DIR)/java
OPENAPI_SPEC = "/local/openapi.yaml"

# Include environment variables
ifneq (,$(wildcard ./.env))
    include .env
    export
endif

# Command to get a token
get-token:
	curl -u $$OAUTH_CLIENT_ID:$$OAUTH_CLIENT_SECRET -d grant_type=client_credentials https://oauth.battle.net/token

# Clean the generated openapi code
.PHONY: clean
clean:
	rm -rf $(GENERATED_DIR)

.PHONY: generate
generate:
	docker run --rm \
	  -v $$PWD:/local \
	  --user $$(id -u):$$(id -g) \
	  $(DOCKER_IMAGE) generate \
	  -i $(OPENAPI_SPEC) \
	  -g java \
	  -o /local/$(GENERATED_DIR_JAVA) \
	  --api-package=com.blizzardapi.openapi \
	  --additional-properties=disallowAdditionalPropertiesIfNotPresent=false \
	  --additional-properties=groupId=com.blizzardapi \
	  --additional-properties=artifactId=openapi \
	  --model-package=com.blizzardapi.openapi.model \
	  --additional-properties=dateLibrary=java8 \
	  --additional-properties=hideGenerationTimestamp=true

.PHONY: install
install:
	mvn clean install -f $(GENERATED_DIR_JAVA)/pom.xml

.PHONY: all
all: clean generate install

.PHONY: publish
publish: 
	mvn -f openapi/java/pom.xml deploy -DaltDeploymentRepository=github::default::https://maven.pkg.github.com/jbwittner/blizzard_openapi

.PHONY: deploy
deploy: publish