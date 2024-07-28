import React from "react";
import FullImput from "../../shared/StateFullimputs/StateFullimput";
import LessImput from "../../shared/StateLessImputs/StateLessImput";
import "./AddTask.css";

const AddTasks = ({onClose, onAdd, setTaskLocal}) => {

    const addNameForOnChangeInput = (text) => {
        console.log(text);
    };

    return (
        <div className="add-tasks-container">
            <form className="add-tasks-container__add-task-form" onSubmit={(ev) => {
                ev.preventDefault();
                console.log(ev);
                onAdd(ev);
            }}>
                <div className="add-task-form__maintaner">
                    <p>Исполнитель</p>
                    <div className="maintaner-info-container">
                        <LessImput placeholder='Ваше имя' type='text' name='name' onChangeProps={addNameForOnChangeInput} classes='maintaner-item'/>
                        <LessImput placeholder='Вашу фамилию' type='text' name='surname' onChangeProps={addNameForOnChangeInput} classes='maintaner-item'/>
                        <LessImput placeholder='Ваше отчество' type='text' name='lastname' onChangeProps={addNameForOnChangeInput} classes='maintaner-item'/>
                    </div>
                </div>
                <div>
                    <p className="label">Введите дату рождения</p>
                    <FullImput name='date' localType='date' />
                    {/* <FullImput localType='password' /> */}
                </div>
                <div>
                    <p className="label">Описание задачи</p>
                    <FullImput name='description' localType='text-area' placeholder='Введите описание задачи'/>
                </div>
                <button className="btn form-btn" onClick={(ev) => onAdd(ev)}>Добавить</button>
                <button className="btn form-btn" onClick={() => onClose()}>Отмена</button>
            </form>
        </div>
    )
};

export default AddTasks;