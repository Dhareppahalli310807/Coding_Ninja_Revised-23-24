import "./styles.css";
import { createBrowserRouter, RouterProvider, Outlet } from "react-router-dom";
import { Navbar } from "./components/Navbar";
import { Home } from "./pages/Home";
import { List } from "./pages/List";
import { Contact } from "./pages/Contact";

// Layout component to wrap routes with Navbar
const Layout = () => (
  <div>
    <Navbar />
    <Outlet />
  </div>
);

const router = createBrowserRouter([
  {
    path: "/",
    element: <Layout />, // Use Layout to wrap the nested routes
    children: [
      { index: true, element: <Home /> },
      { path: "list", element: <List /> },
      { path: "contact", element: <Contact /> }
    ]
  }
]);

export default function App() {
  return (
    <div className="App">
      <RouterProvider router={router} />
    </div>
  );
}
