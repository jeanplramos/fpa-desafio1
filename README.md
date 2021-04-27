# fpa-desafio1
FPA Desafio 1

# Imagens criadas
nginx-> jeanplramos/fpades1nginx

Java App-> jeanplramos/fpades1app

# Entrar no diretório principal do repositorio
Entrar na pasta fpa-desafio1 do repositório clonado

# Criar a rede para os containers
docker network create desafio1-network

# Iniciar o mysql
docker run -d --name mysqlfpa --network=desafio1-network -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=fpafullcycle -v $(pwd)/mysql:/var/lib/mysql mysql

# Iniciar a aplicação Java SpringBoot
docker run -d --name app --network=desafio1-network jeanplramos/fpades1app

# Iniciar o NGINX
docker run -d --name nginx --network=desafio1-network -p 8080:8080 jeanplramos/fpades1nginx

# Para testar a aplicação execute:
curl http://localhost:8080/
