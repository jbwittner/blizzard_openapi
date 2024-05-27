DOCKER_IMAGE = "openapitools/openapi-generator-cli:v7.2.0"
GENERATED_DIR_JAVA = "openapi/java"
OPENAPI_SPEC = "/local/openapi.yaml"

# Inclure le fichier .env et exporter toutes les variables
ifneq (,$(wildcard ./.env))
    include .env
    export
endif

# Commande pour récupérer un token
get-token:
	curl -u $$OAUTH_CLIENT_ID:$$OAUTH_CLIENT_SECRET -d grant_type=client_credentials https://oauth.battle.net/token

.PHONY: clean-openapi
clean-openapi:
	rm -rf $(GENERATED_DIR_JAVA)

.PHONY: generate-openapi
generate-openapi:
	docker run --rm \
	  -v $$PWD:/local \
	  --user $$(id -u):$$(id -g) \
	  $(DOCKER_IMAGE) generate \
	  -i $(OPENAPI_SPEC) \
	  -g java \
	  -o /local/$(GENERATED_DIR_JAVA) \
	  --api-package=fr.wittner.openapi.api \
	  --additional-properties=disallowAdditionalPropertiesIfNotPresent=false \
	  --additional-properties=groupId=fr.wittner \
	  --additional-properties=artifactId=openapi \
	  --model-package=fr.wittner.openapi.model \
	  --additional-properties=dateLibrary=java8 \
	  --additional-properties=hideGenerationTimestamp=true

.PHONY: install-openapi
install-openapi:
	mvn clean install -f $(GENERATED_DIR_JAVA)/pom.xml

.PHONY: all
all: clean-openapi generate-openapi install-openapi
