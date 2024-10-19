# java-github-cicd

## Criar a imagem:
```sh
docker build -t vinissaum/java-github-cicd:1.0 .
```

## Enviar para o docker hub:
```sh
docker push vinissaum/java-github-cicd:1.0
```

## Rodar o container localmente:
```sh
docker run -p 8080:8080 vinissaum/java-github-cicd:1.0
```

## Endereço público da imagem para implantação em nuvem
`docker.io/vinissaum/java-github-cicd:1.0`

## Passo a passo para implantação

### Criar Arquivo YAML para o GitHub Actions

### Recursos a Criar no Portal do Azure
- Grupo de Recursos
- Azure Active Directory Service Principal
    - via Azure CLI: `az ad sp create-for-rbac --name "github-actions-sp" --sdk-auth --role contributor --scopes /subscriptions/<subscription-id>/resourceGroups/<resource-group>`

### Configurações no GitHub
- Secrets do GitHub:
    - DOCKER_USERNAME
    - DOCKER_PASSWORD
- AZURE_CREDENTIALS: Adicione o JSON gerado no Azure CLI como um segredo no GitHub com o nome `AZURE_CREDENTIALS`

### Acessar a aplicação no endpoint gerado pelo ACI, que será algo como:
`http://java-aci-app.<region>.azurecontainer.io:8080`
