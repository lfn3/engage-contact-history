(ns engage-contact-history.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (POST "/database/contacts" {qparams :query-params body :body} (pass-req "POST" "/database/contacts" qparams (slurp body)))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
