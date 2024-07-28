import React from "react";
import { Link } from "react-router-dom";
import './HeaderMenu.css';


export const HeaderMenu = () => {
    return (
        <div className="header-menu-container">
            <nav className="header-menu-container__nav-menu">
                <Link to='/main' className="nav-menu__nav-item">Главная страница</Link>
                <Link to='/tasks' className="nav-menu__nav-item">Список задач</Link>
            </nav>
        </div>
    )
};