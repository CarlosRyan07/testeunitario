FROM maven:3.9.9-amazoncorretto-23

EXPOSE 8080

RUN mkdir -p /home/testeunitario

COPY ./ /home/testeunitario

WORKDIR /home/testeunitario

