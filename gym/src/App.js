import React from "react";
import Home from "./pages/Home";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import About from "./components/About";
import Services from "./components/Services";
import Login from "./components/Login";
import Signup from "./components/Signup";
function App() {
  return (
    <BrowserRouter>
      <Routes>

          <Route
            path="/"
            element={
              <Home></Home>
            }
          />
         
          <Route
            path="/login"
            element={
              <Login></Login>
            }
          />
          <Route
            path="/signup"
            element={
              <Signup></Signup>
            }
          />
         
          <Route
            path="/about"
            element={
              <About></About>
            }
          />
          <Route
            path="/services"
            element={
              <Services></Services>
            }
          />
          
         
    
      </Routes>
    </BrowserRouter>
  );
}


export default App;