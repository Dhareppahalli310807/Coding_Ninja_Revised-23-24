import "./styles.css";
import { useState } from "react";
import { Navbar } from "./Navbar";
import { Home } from "./Home";
import { LanguageContext } from "./languageContext";
import { ThemeContext } from "./themeContext";

export default function App() {
  const [theme, setTheme] = useState("light");
  const [language, setLanguage] = useState("English");

  return (
    <ThemeContext.Provider value={{ theme, setTheme }}>
      <LanguageContext.Provider value={{ language, setLanguage }}>
        <div className={`App ${theme}`}>
          <Navbar />
          <Home />
        </div>
      </LanguageContext.Provider>
    </ThemeContext.Provider>
  );
}
