import "./styles.css";
import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";

import { Navbar } from "./components/Navbar";
import { Home } from "./pages/Home";
import { List } from "./pages/List";
import { Contact } from "./pages/Contact";
import { ItemDetails } from "./pages/ItemDetails";
import { NotFound } from "./pages/NotFound";
import ProtectedRoute from "./components/ProctectedRoute";
import { useState } from "react";

export default function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(true);

  const router = createBrowserRouter([
    {
      path: "/",
      errorElement: <NotFound />,
      element: <Navbar />,
      children: [
        {
          index: true,
          element: <Home loggedIn={isLoggedIn} setLoggedin={setIsLoggedIn} />
        },
        {
          path: "/contact",
          element: (
            <ProtectedRoute loggedIn={isLoggedIn}>
              <Contact />
            </ProtectedRoute>
          )
        },
        {
          path: "/list",
          children: [
            {
              index: true,
              element: (
                <ProtectedRoute loggedIn={isLoggedIn}>
                  <List />
                </ProtectedRoute>
              )
            },
            {
              path: ":itemId",
              element: (
                <ProtectedRoute loggedIn={isLoggedIn}>
                  <ItemDetails />
                </ProtectedRoute>
              )
            }
          ]
        }
      ]
    }
  ]);

  return (
    <div className="App">
      <RouterProvider router={router} />
    </div>
  );
}
