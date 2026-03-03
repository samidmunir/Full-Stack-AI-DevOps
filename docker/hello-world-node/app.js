import express from "express";
import os from "os";

const PORT = process.env.PORT || 3000;
const ENV = process.env.ENV_VALUE || "No env set";
const HOSTNAME = process.env.HOSTNAME || os.hostname();

const app = express();

app.get("/", (req, res) => {
  res.json({
    message: "Hello from Simple App (Node)",
    env: ENV,
    container: HOSTNAME,
  });
});

app.listen(PORT, () => {
  console.log(`Node Hello listening on ${PORT}`);
});
