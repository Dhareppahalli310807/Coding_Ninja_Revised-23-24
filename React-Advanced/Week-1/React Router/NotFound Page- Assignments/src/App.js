import "./styles.css";
import { createBrowserRouter, RouterProvider } from "react-router-dom";

import { Navbar } from "./components/Navbar";
import { Home } from "./pages/Home";
import { List } from "./pages/List";
import { Contact } from "./pages/Contact";
import { ItemDetails } from "./pages/ItemDetails";
import { NotFound } from "./pages/NotFound"; // Import NotFound page

export default function App() {
  const router = createBrowserRouter([
    {
      path: "/",
      element: <Navbar />,
      children: [
        { index: true, element: <Home /> },
        { path: "/contact", element: <Contact /> },
        {
          path: "/list",
          children: [
            { index: true, element: <List /> },
            { path: ":itemId", element: <ItemDetails /> }
          ]
        }
      ]
    },
    { path: "*", element: <NotFound /> } // Add NotFound route for all other paths
  ]);

  return (
    <div className="App">
      <RouterProvider router={router} />
    </div>
  );
}
