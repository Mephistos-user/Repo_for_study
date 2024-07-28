import React, { useState } from "react";
import AddTasks from "./AddTasks/AddTask";
import TaskList from "./TaskList";

const TaskManager = () => {

    const [addTaskIsOpened, setAddTaskIsOpened] = useState(false);
    const [taskList, setTaskList] = useState([]);
    const [task, setTask] = useState([]);


    const onCloseAddTask = () => {
        setAddTaskIsOpened(false);
    }

    const onAdd = (ev) => {
        // console.log(Object.values(ev.target).reduce((obj, field) => { obj[field.name] = field.value; return obj}, {}));
        const obj = Object.values(ev.target).reduce((obj, field) => { obj[field.name] = field.value; return obj}, {});
        setTask(obj);
        // debugger;
        setTaskList([...taskList, task]);
    }

    const reducedTask = () => {

    } 

    return (
        <div className="tasks-container">
            {addTaskIsOpened && <div className="middle-ware-for-pop-up"></div>}
            <button className="btn tasks-container__add-task-button" onClick={() => setAddTaskIsOpened(!addTaskIsOpened)}>
                Добавить задачу
            </button>
            {addTaskIsOpened && <AddTasks onClose={onCloseAddTask} onAdd={(ev) => onAdd(ev)}/>}
            <TaskList tasks={taskList}/>
        </div>
    )
};

export default TaskManager;