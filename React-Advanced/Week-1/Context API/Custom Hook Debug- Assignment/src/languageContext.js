import { createContext, useContext, useState } from "react";

export const LanguageContext = createContext();

// Correct the custom hook name to match the context
export const useLanguage = () => {
  const context = useContext(LanguageContext);
  if (context === undefined) {
    throw new Error("useLanguage must be used within a LanguageContextProvider");
  }
  return context;
};

// Ensure the provider component accepts children
export const LanguageContextProvider = ({ children }) => {
  const [language, setLanguage] = useState("English");

  return (
    <LanguageContext.Provider value={{ language, setLanguage }}>
      {children}
    </LanguageContext.Provider>
  );
};
