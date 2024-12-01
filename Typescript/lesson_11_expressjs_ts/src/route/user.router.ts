// const express = require('express');
import express, { NextFunction, Request, Response, Router } from "express";
import { getUsers } from "../service/user.service";




const router: Router = express.Router();

// middleware that is specific to this router
router.use((req: Request, res: Response, next: NextFunction) => {
  console.log('Time: ', Date.now());
  next();
});

// define the home page route
router.get('/', async (req, res): Promise<void> => {
    const users = await getUsers();
    res.send(`Users home page... ${JSON.stringify(users)}`);
})

// define the about route
router.get('/about', (req, res) => {
    res.send('About users');
})

export default router;
// module.exports = router;