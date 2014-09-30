(ns engage-contact-history.mapper (
  :require [clojure.edn :as edn]))

(use '(clojure.java [io :as io]))

(defn APITokenMappingsFromEdn []
  (with-open [rdr (-> (io/resource "config/api-tok-map.edn")
                      io/reader
                      java.io.PushbackReader.)]
    (edn/read rdr)))

(APITokenMappingsFromEdn)
