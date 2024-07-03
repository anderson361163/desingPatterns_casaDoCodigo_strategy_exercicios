# Usa uma imagem base do OpenJDK 8 com Alpine Linux
FROM openjdk:8-jdk-alpine

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia os arquivos do projeto para o contêiner
COPY src/ /app/src
#COPY .classpath /app
#COPY .settings/ /app/.settings
#COPY bin/ /app/bin
#COPY .project /app

# Compila o código Java
RUN mkdir -p bin
RUN javac -cp bin -d bin src/br/com/casaCodigo/*.java

# Define o comando de execução da aplicação Java
CMD ["java", "-cp", "bin", "br.com.casaCodigo.Principal"]
