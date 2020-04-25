(ns hello-ring.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn handler
  [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world!"})

(defn -main
  [& args]
  (jetty/run-jetty
   handler
   {:port 3000}))
