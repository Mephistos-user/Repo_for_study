// const express = require('express');


import express, { Express, Request, Response } from "express";
import usersRouter from "./route/user.router";

import { AppDataSource } from "./data-source";
import { User } from "./entity/User";

const app: Express = express();
const port = 3000;

AppDataSource.initialize().then(async () => {

    console.log("Inserting a new user into the database... ");
    const user = new User();
    user.firstname = "Ivan";
    user.lastname = "Ivanov";
    user.age = 25;
    // await AppDataSource.manage.save(user);
    console.log("Saved a new user with id: " + user.id);

    console.log("Loading users from the database... ");
    const users = await AppDataSource.manager.find(User);
    console.log("Loaded users: ", users);

    console.log("Here you can setup and run express / fastify / any other framework.");

    }).catch(error => console.log(error));

app.use('/api/users', usersRouter);

app.get('/', (req: Request, res: Response) => {
    res.send('Hello World!');
});

app.listen(port, () => {
    console.log(`Server running at http://localhost: ${port}`);
});