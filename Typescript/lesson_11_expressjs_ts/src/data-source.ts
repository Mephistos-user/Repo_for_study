import "reflect-metadata";
import { DataSource } from "typeorm";
import { User } from "./entity/User";

export const AppDataSource = new DataSource({
    type: "postgres", // type of database
    host: "localhost", // database host
    port: 5432, // database port
    username: "postgres", // database username
    password: "postgres", // database password
    database: "postgres", // database
    synchronize: true,  // Автоматически синхронизировать схему базы данных с сущностями
    logging: false,  //  Включить ведение журнала для операций TypeORM
    entities: [User], //
    migrations: ["src/migration/**/*.ts"], // Миграции для синхронизации схемы базы данных
    subscribers: ["src/subscriber/**/*.ts"], // Подписчики для событий TypeORM
})