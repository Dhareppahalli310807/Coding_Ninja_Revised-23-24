import "./styles.css";

export default function App() {
  return (
    <div className="App">
      <form style={style.from} >
        <h3 style={style.h1}>Sign Up</h3>
        <input style= {style.in}placeholder="Username" />
        <input style={style.in} placeholder="Email" />
        <input style={style.in}placeholder="Password" />
        <div
          style={style.button}>
          <button style={style.button1}> Cancel</button>
          <button style={style.button3}>Login</button>
        </div>
      </form>
    </div>
  );
}
const style={
  from:{   
  width: "60%",
  margin: "50px auto",
  display: "flex",
  flexDirection: "column",
  gap: 20
},
h1:{
  fontSize: "2rem", 
  letterSpacing: 2
},
in:{
  padding: 10 
},
button:{
  display: "flex",
  justifyContent: "center",
  gap: 20
},
button1:{
  outline: "none",
  paddingBlock: 5,
  width: 100,
  backgroundColor: "red",
  color: "white",
  cursor: "pointer"
},
button3:{
  outline: "none",
  paddingBlock: 5,
  width: 100,
  backgroundColor: "red",
  color: "white",
  cursor: "pointer"
}
}