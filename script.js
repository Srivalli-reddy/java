import React from"react";
import { createRoot } from "react-dom/client";
import { BrowserRouter,Routes,Route } from "react-router-dom";
import Restaurant from "./Restaurant";
import Menu from"./Menu";

const App = () => {
    return (
        <BrowserRouter>
        <Routes>
            <Route path ="/"element={<Restaurant/>} />
            <Route path ="/Menu"element ={<Menu />} />
            </Routes>
            </BrowserRouter>
    );
};
const root =document.getElementById("root");
const rootele = createRoot (root);
rootele.render(<App/>);