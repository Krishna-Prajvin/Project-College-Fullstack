import React from "react";
import SimpleCarousel from "../components/Home/Carousel";
import workout_tracking from "../assets/featues/workout-tracking.webp";
import health_insight from "../assets/featues/health-insight.webp";
import personalized_recommendation from "../assets/featues/personalized-recommendation.webp";
import { ReviewSlider } from "../components/Home/ReviewSlider";

export const Home = () => {
  return (
    <div className="container mx-auto px-4 py-8 mt-16 bg-black text-white">
      <SimpleCarousel />

      <div className="grid grid-cols-1 md:grid-cols-3 gap-8 mb-8 mt-10">
        <div className="card hover:scale-105 hover:shadow-md bg-gray-800 p-4 rounded shadow text-center">
          <img
            src={workout_tracking}
            alt="Workout Tracking"
            className="mx-auto mb-4 w-[200px] h-[200px] object-cover rounded-md"
          />
          <h3 className="text-xl font-bold mb-2 text-white">Workout Tracking</h3>
          <p>This feature provides detailed analysis of your workout performance, including metrics like total volume lifted or average workout intensity. This helps you understand your progress better and identify areas where you might need to adjust your routine.</p>
        </div>
        <div className="card hover:scale-105 hover:shadow-md bg-gray-800 p-4 rounded shadow text-center">
          <img
            src={health_insight}
            alt="Health Insights"
            className="mx-auto mb-4 w-[200px] h-[200px] object-cover rounded-md"
          />
          <h3 className="text-xl font-bold mb-2 text-white">Health Insights</h3>
          <p>Set personal health goals, such as improving your sleep quality or reducing your stress levels. The platform tracks your progress toward these goals and provides insights on how well you’re doing. This keeps you focused and helps you adjust your strategies as needed.</p>
        </div>
        <div className="card hover:scale-105 hover:shadow-md bg-gray-800 p-4 rounded shadow text-center">
          <img
            src={personalized_recommendation}
            alt="Personalized Recommendations"
            className="mx-auto mb-4 w-[200px] h-[200px] object-cover rounded-md"
          />
          <h3 className="text-xl font-bold mb-2 text-white">
            Personalized Recommendations
          </h3>
          <p>Your recommendations are aligned with your specific health and fitness goals. Whether you’re focusing on losing weight, gaining muscle, improving cardiovascular health, or enhancing overall fitness, the advice you receive is designed to help you achieve those goals effectively.</p>
        </div>
      </div>

      <section className="bg-gray-800 p-8 rounded shadow mb-8 text-white">
        <h2 className="text-2xl font-bold text-center mb-4">About Krish Fitness</h2>
        <p3
          style={{
            textAlign: "justify",
            textIndent: "50px",
            lineHeight: "1.6",
            marginTop: "20px",
            marginBottom: "20px",
          }}
        >
          Krish Fitness is an all-encompassing fitness platform designed to revolutionize how individuals approach their health and wellness. With a focus on integrating modern technology, personalized guidance, and community support, Krish Fitness provides users with the tools they need to achieve their fitness goals efficiently and effectively.
          Krish Fitness is dedicated to promoting a healthy lifestyle by providing comprehensive fitness solutions. The aim is to empower individuals to achieve their health and wellness goals through structured workout plans, nutrition guidance, and advanced tracking tools. Krish Fitness envisions becoming a leading fitness platform recognized for its innovation, user-centric design, and effectiveness in helping users reach their health goals. The platform aims to set new standards in the fitness industry by combining cutting-edge technology with expert advice and community support.
          The platform’s interface is designed with the user in mind, offering a clean, intuitive, and easy-to-navigate experience. Whether a user is tech-savvy or a beginner, Krish Fitness ensures a smooth journey through its features. Krish Fitness is accessible on various devices, including smartphones, tablets, and desktops, ensuring that users can track their progress anytime, anywhere.
          Unlike many fitness apps that focus solely on workouts or nutrition, Krish Fitness offers a holistic approach, combining exercise, diet, health monitoring, and community support.
          The platform stands out for its ability to provide personalized plans and recommendations, ensuring that users receive advice tailored to their unique needs and goals.
          With seamless integration with wearables and real-time data syncing, Krish Fitness ensures that users have access to the most accurate and up-to-date information.
          The emphasis on community helps users stay motivated, accountable, and connected, enhancing the overall fitness journey.
          Krish Fitness plans to integrate more advanced AI algorithms to further personalize user experiences, including predictive analytics for injury prevention and performance optimization.
          The platform aims to expand its reach globally, offering multi-language support and region-specific fitness plans.
          Krish Fitness is committed to helping individuals transform their lives through fitness and nutrition. By offering a well-rounded, tech-driven, and user-friendly platform, it sets the stage for users to achieve their best selves.
        </p3>
      </section>

      <section>
        <ReviewSlider />
      </section>
    </div>
  );
};
