import Button from "./Button";
import styles from "./AppTitle.module.css";
import { useState, useEffect } from "react";

function App() {
  const [value, setValue] = useState(0);
  const [keyword, setKeuword] = useState("");
  const onClick = () => setValue((prev) => prev + 1);
  const onChange = (event) => setKeuword(event.target.value);
  console.log("I run all the time");
  useEffect(() => {
    console.log("I run only once");
  }, []);
  useEffect(() => {
    if (keyword.length > 5) console.log("Search for", keyword);
  }, [keyword]);
  return (
    <div>
      <h1 className={styles.title}>Welcome Back!</h1>
      <Button text={"Continue"} />
      <input
        value={keyword}
        onChange={onChange}
        type="text"
        placeholder="Search here..."
      />
      <h1>{value}</h1>
      <button onClick={onClick}>Click me</button>
    </div>
  );
}

export default App;
