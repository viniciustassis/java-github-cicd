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
