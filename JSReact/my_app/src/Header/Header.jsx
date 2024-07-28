import React from "react";
import HeaderWidget from "../HeaderWidget/HeaderWidget";
import './Header.css';
import { HeaderMenu } from "./HeaderMenu/HeaderMenu";

const Header = (props) => {
    return (
        <div className="header-container">
            <HeaderMenu />
            <HeaderWidget />
        </div>
    )
};

export default Header;