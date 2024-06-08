import React, { Component } from "react";

// Complete this Component
const ListItem = ({ name, link, icon, bgColor }) => {
  return (
    <div
      className="ListItem"
      style={{
        backgroundColor: bgColor,
        display: "flex",
        alignItems: "center",
        padding: "10px",
        marginBottom: "10px",
        borderRadius: "5px"
      }}
    >
      <img src={icon} alt={name} style={{ width: "30px", marginRight: "10px" }} />
      <a href={link} target="_blank" rel="noopener noreferrer" style={{ textDecoration: "none", color: "black" }}>
        {name}
      </a>
    </div>
  );
};

export default ListItem;
