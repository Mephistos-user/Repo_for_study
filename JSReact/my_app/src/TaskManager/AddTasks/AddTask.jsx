import React from "react";
import FullImput from "../../shared/StateFullimputs/StateFullimput";
import LessImput from "../../shared/StateLessImputs/StateLessImput";
import "./AddTask.css";

const AddTasks = () => {

    const addNameForOnChangeInput = (text) => {
        console.log(text);
    };

    return (
        <div className="add-tasks-container">
            <form className="add-tasks-container__add-task-form">
                <div className="add-task-form__maintainer">
                    <p>Исполнитель</p>
                    <LessImput placeholder='Ваше имя' type='text' onChangeProps={addNameForOnChangeInput}/>
                    <LessImput placeholder='Вашу фамилию' type='text' onChangeProps={addNameForOnChangeInput}/>
                    <LessImput placeholder='Ваше отчество' type='text' onChangeProps={addNameForOnChangeInput}/>
                </div>
                <div>
                    <FullImput localType='date' />
                    <FullImput localType='password' />
                </div>
            </form>
        </div>
    )
};

export default AddTasks;