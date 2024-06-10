import styled from "styled-components";

// Define and export the ButtonView styled component
export const ButtonView = styled.button`
  padding: 10px 20px;
  font-size: 1rem;
  cursor: pointer;
  ${(props) =>
    props.filled
      ? `
    background-color: ${props.bg || "#000"};
    color: ${props.color || "#fff"};
    border: none;
  `
      : `
    background-color: #fff;
    color: #000;
    border: 2px solid #000;
  `}
`;
