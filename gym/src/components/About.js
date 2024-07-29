import React from "react";
import styled from "styled-components";
import bg from "../assets/class2.jpg";
import Button from "./reusable/Button";
import H1 from "./reusable/H1";
import H2 from "./reusable/H2";
import Paragraph from "./reusable/Paragraph";
import WithBarTitle from "./reusable/WithBarTitle";

export default function About() {
  return (
    <Container>
      <Left>
        <Image src={bg} />
      </Left>
      <Right>
        <WithBarTitle title="About Our Gym" />
        <H1 color="#2c234d">
          BUILD MUSCLES OR LOOSE WEIGHT WITH OUR GYM!
        </H1>

        <H2>
          We are a team of 4 trainers who will help you become who you wanted to be.
          If you want to build muscles or if you want to loose weight, we are the best solution.
          With our world class equipments and with our certified trainers, we will help you achieve your goal.
        </H2>

        <Paragraph>
          For more details, please contact us.
        </Paragraph>

        <Button style={{ marginTop: 30 }}>Contact Us</Button>
      </Right>
    </Container>
  );
}

const Container = styled.div`
  width: 100%;
  height: 100vh;
  background: white;
  display: flex;
  flex-direction: row;
  align-items: center;
`;

const Left = styled.div`
  width: 50%;
  height: 100%;
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
`;
const Right = styled.div`
  width: 45%;
`;
const Image = styled.img`
  width: 70%;
  height: 80%;
`;
