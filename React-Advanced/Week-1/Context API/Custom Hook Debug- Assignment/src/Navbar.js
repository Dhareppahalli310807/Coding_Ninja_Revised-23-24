// Navbar.js
import { useLanguage } from "./languageContext";
import { useTheme } from "./themeContext";

export const Navbar = () => {
  const { theme, setTheme } = useTheme();
  const { language } = useLanguage();

  const changeTheme = () => {
    setTheme(theme === "light" ? "dark" : "light");
  };

  return (
    <div className="navbar">
      <span>Dialecto</span>
      <div className="right">
        <button onClick={changeTheme}>
          {theme === "light" ? "Dark" : "Light"} Theme
        </button>
        <span>{language}</span>
      </div>
    </div>
  );
};
