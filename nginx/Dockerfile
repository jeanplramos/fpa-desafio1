FROM nginx:1.20.0-alpine

RUN rm /etc/nginx/conf.d/default.conf
COPY nginx.conf /etc/nginx/conf.d

RUN mkdir /var/www/public -p && touch /var/www/public/index.htm
