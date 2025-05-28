import React from"react";
 import { Link } from "react-router-dom";

const Restaurant = () => {
    return (
        <>
        <Link to = "/Menu">
        <img
        src="https://img.freepik.com/free-photo/healthy-lunch-table-restaurant_140725-6523.jpg?semt=ais_items_boosted&w=740"
        alt="Dish"
        style={{ cursor: "pointer" , width: "100%" , maxwidth: "600px"}}
        />
        </Link>
        </>
    );
};

export default Restaurant;