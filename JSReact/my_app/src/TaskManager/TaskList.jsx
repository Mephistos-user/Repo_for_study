import React from "react";

const TaskList = ({tasks}) => {
    return (
        <div>
            <p>Task List</p>
            {tasks.map((task, index) => {
                return (
                    <div key={index}>
                        <p>Номер задачи - {index + 1}</p>
                        <p>Имя исполнителя - {task.name}</p>
                        <p>Фамилия исполнителя - {task.surname}</p>
                        <p>Отчество исполнителя - {task.lastname}</p>
                        <div>
                            <p>Описание задачи:</p>
                            {task.description}
                        </div>
                    </div>
                )
            })}
        </div>
    )
};

export default TaskList;