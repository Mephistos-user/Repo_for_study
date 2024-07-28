import React, { useState } from "react";
import AddTasks from "./AddTasks/AddTask";

const TaskManager = () => {

    const [addTaskIsOpened, setAddTaskIsOpened] = useState(false);

    return (
        <div className="tasks-container">
            <button className="btn tasks-container__add-task-button" onClick={() => setAddTaskIsOpened(!addTaskIsOpened)}>
                Добавить задачу
            </button>
            {addTaskIsOpened && <AddTasks />}
        </div>
    )
};

export default TaskManager;