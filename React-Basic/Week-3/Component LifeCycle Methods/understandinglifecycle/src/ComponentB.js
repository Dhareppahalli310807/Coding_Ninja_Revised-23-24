import React from "react";

class ComponentB extends React.Component{
    constructor(){
        super();
        this.state ={
            name: "ComponentB"
        }
        console.log("ComponentB Constructor");
        // getting error cant call setState inside constructor

        // this.setState({
        //     name:"CA"
        // })
    }


    static getDerivedStateFromProps(props, state){
        console.log("ComponentB getDerivedStateFromProps");
        // get error can not read property of undefined setState
        
        // this.setState({
        //     name:"CA"
        // })
        return null;
    }

    componentDidMount(){
        console.log("ComponentB componentDidMount");
    }


    render(){
        console.log("ComponentB Render");
        // it go inside infinite loop because emplicitelly render call

        // this.setState({
        //     name:"CA"
        // })
        return(
            <h2>{this.state.name}</h2>
        )
    }
}

export default ComponentB;