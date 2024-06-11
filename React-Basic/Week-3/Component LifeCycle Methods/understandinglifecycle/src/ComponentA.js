import React from "react";
import ComponentB from "./ComponentB";

class ComponentA extends React.Component{
    constructor(){
        super();
        this.state ={
            name: "ComponentA",
            data: []
        }
        console.log("ComponentA Constructor");
        // getting error cant call setState inside constructor

        // this.setState({
        //     name:"CA"
        // })
    }


    static getDerivedStateFromProps(props, state){
        console.log("ComponentA getDerivedStateFromProps");
        // get error can not read property of undefined setState

        // this.setState({
        //     name:"CA"
        // })
        return null;
    }

    componentDidMount(){
        console.log("ComponentA componentDidMount");
        fetch('https://jsonplaceholder.typicode.com/users')
        .then(response => response.json())
        .then(data => this.setState({data:data}))
    }


    render(){
        console.log(this.state.data);
        // it go inside infinite loop because emplicitelly render call

        // this.setState({
        //     name:"CA"
        // })
        return(
            <>
             <h1>{this.state.name}</h1>
             <ul>
                {this.state.data.map((d)=>{
                    return(
                        <li>{d.username}</li>
                    )
                })}
             </ul>
            </>
           
        )
    }
}

export default ComponentA;