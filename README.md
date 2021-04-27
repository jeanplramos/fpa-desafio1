# fpa-desafio1
FPA Desafio 1

# Iniciar o mysql
docker run -d --name mysqlfpa --network=desafio1-network -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=fpafullcycle -v $(pwd)/mysql:/var/lib/mysql mysql

# Iniciar a aplicação Java SpringBoot
docker run -d --name app --network=desafio1-network jeanplramos/fpades1app

# Iniciar o NGINX
docker run -d --name nginx --network=desafio1-network -p 8080:8080 jeanplramos/fpades1nginx

# Para testar a aplicação execute:
curl http://localhost:8080/
