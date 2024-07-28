import React from "react";
import { Route, Routes } from "react-router";
import TaskManager from "../TaskManager/TaskManager";

const RouterMenu = () => {
    return (
        <Routes>
            <Route path="/home" element={null}/>
            <Route path="/tasks" element={<TaskManager />}/>
        </Routes>
    )
};

export default RouterMenu;