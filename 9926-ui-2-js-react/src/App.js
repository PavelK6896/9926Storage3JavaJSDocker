import './App.css';
import {getUser, getUser3} from "./service/Main";
import {useState} from "react";

function App() {

    const [state, setState] = useState({users1: []});
    const get1 = () => {
        getUser().then((r) => {
            console.log(r)
            setState({users1: r})
        })
    }
    return (
        <div className="App">
            <header className="App-header">
                <p>{state.users1.map((value, index) => {
                    return <i key={index}>{index + ' ' + value.id + ' ' + value.enabled}<br/></i>
                })}</p>
                <br/>
                <button onClick={get1}>
                    getUser
                </button>
                <br/>
                <button onClick={() => {getUser3().then((r)=> {setState({users1: r})})}}>
                    getUser3
                </button>
            </header>
        </div>
    );
}

export default App;
