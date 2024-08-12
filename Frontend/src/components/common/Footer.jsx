import React from 'react'
import { Link } from 'react-router-dom'
import { FaFacebook } from "react-icons/fa";
import { FaTwitter } from "react-icons/fa";
import { FaInstagram } from "react-icons/fa";
import { FaLinkedin } from "react-icons/fa";
import { MdOutlineEmail } from "react-icons/md";
import { FaPhoneAlt } from "react-icons/fa";
import logo from "../../assets/logo/smart fitness and nutrition tracker logo.webp"


export const Footer = () => {
  return(
    <footer className="bg-gray-100 py-4 text-black border-t-2">
    <div className="container mx-auto px-4 flex justify-between  gap-24 mt-10">

      <div className='flex flex-col gap-5'>
        <img src={logo} alt="logo" width={100} height={50} className='rounded-full'/>
        <p className='flex gap-x-2 items-center'><MdOutlineEmail/> <a href="mailto:smartfitnessandnutritiontracker@gmail.com">krishnaprajvinfitness@skct.com</a></p>
        <p className='flex gap-x-2 items-center'><FaPhoneAlt/><a href="tel:+91 9876543210">+91 9876543210</a> </p>

      </div>
      <div className="flex space-x-4 flex-col gap-2 text-center">
        
        {/* <Link to="/" className="hover:text-gray-700 hover:underline">Home</Link> */}
        <Link to="/workouts" className="hover:text-gray-700 hover:underline">Workouts</Link>
        <Link to="/progress-dashboard" className="hover:text-gray-700 hover:underline">Fitness Tracker</Link>
        <p1>Copyright © Krish Fitness 2024</p1>
      </div>

      <div className="flex space-x-4">
        <a href="#" className="text-xl hover:text-gray-400"><FaFacebook/></a>
        <a href="#" className="text-xl hover:text-gray-400"><FaTwitter/></a>
        <a href="#" className="text-xl hover:text-gray-400"><FaInstagram/></a>
        <a href="#" className="text-xl hover:text-gray-400"><FaLinkedin/></a>
      </div>
    </div>
  </footer>
  )
}
