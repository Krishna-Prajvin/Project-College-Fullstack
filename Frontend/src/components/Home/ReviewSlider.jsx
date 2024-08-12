import React from "react";
import p1 from "../../assets/testinomial/vismay-patel.jpg";
import p2 from "../../assets/testinomial/anjali thakur.jpg";
import p3 from "../../assets/testinomial/arvind singh.jpg";
import { Swiper, SwiperSlide } from "swiper/react";
import "swiper/css";
import { Pagination, Autoplay, FreeMode } from "swiper/modules";
import "swiper/css/free-mode";
import "swiper/css/pagination";

export const ReviewSlider = () => {
  return (
    <Swiper
      slidesPerView={3}
      spaceBetween={25}
      loop={true}
      freeMode={true}
      autoplay={{
        delay: 2500,
        disableOnInteraction: false,
      }}
      modules={[FreeMode, Pagination, Autoplay]}
      className="w-full"
    >
      <SwiperSlide>
        <div className="bg-white p-4 rounded shadow text-center">
          <img
            src={p1}
            alt="User 1"
            className="mx-auto mb-4 rounded-full w-16 object-cover h-16"
          />
          <p className="text-black">
          "I've been using Krish Fitness for a few months now, and the personalized recommendations have been a game-changer for me. The workout routines are perfectly tailored to my fitness level and goals, which has helped me stay motivated and see real progress. The meal suggestions are also spot-on, and I love that they take my dietary preferences into account. It’s like having a personal trainer and nutritionist in my pocket! Thanks to Krish Fitness"  - Henry Alex
          </p>
        </div>
      </SwiperSlide>
      <SwiperSlide>
        <div className="bg-white p-4 rounded shadow text-center">
          <img
            src={p2}
            alt="User 2"
            className="mx-auto mb-4 rounded-full h-16 w-16 object-cover"
          />
          <p className="text-black">"The personalized recommendations on Krish Fitness have completely transformed my approach to fitness. I used to struggle with figuring out what workouts and meals were best for me, but now the platform does all the hard work. The adaptive programs keep me challenged and engaged, and the custom nutrition advice has made a huge difference in my energy levels and overall health. I highly recommend it to anyone looking to up their fitness game!" - Katy perry
          </p>
        </div>
      </SwiperSlide>
      <SwiperSlide>
        <div className="bg-white p-4 rounded shadow text-center">
          <img
            src={p3}
            alt="User 3"
            className="mx-auto mb-4 rounded-full w-16 h-16 object-cover"
          />
          <p className="text-black">
          "Krish Fitness’s personalized recommendations are fantastic! I appreciate how the workouts are adjusted based on my progress and goals, which keeps me from hitting a plateau. The meal plans are incredibly helpful too; they match my taste preferences and dietary needs perfectly. It feels like the platform really understands what I need to succeed and helps me stay on track.Looking Forward to achieve more with Krish Fitness!" - John Ibrahim
          </p>
        </div>
      </SwiperSlide>
    </Swiper>
  );
};
