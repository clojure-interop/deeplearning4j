(ns org.deeplearning4j.ui.UiConnectionInfo
  "POJO describing the location and credentials for DL4j UiServer instance"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui UiConnectionInfo]))

(defn ->ui-connection-info
  "Constructor."
  (^UiConnectionInfo []
    (new UiConnectionInfo )))

(defn set-session-id
  "session-id - `java.lang.String`"
  ([^UiConnectionInfo this ^java.lang.String session-id]
    (-> this (.setSessionId session-id))))

(defn get-first-part
  "This method returns scheme, address and port for this UiConnectionInfo
  i.e: https://localhost:8080

  returns: `java.lang.String`"
  (^java.lang.String [^UiConnectionInfo this]
    (-> this (.getFirstPart))))

(defn get-second-part
  "n-path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^UiConnectionInfo this ^java.lang.String n-path]
    (-> this (.getSecondPart n-path)))
  (^java.lang.String [^UiConnectionInfo this]
    (-> this (.getSecondPart))))

(defn get-full-address
  "n-path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^UiConnectionInfo this ^java.lang.String n-path]
    (-> this (.getFullAddress n-path)))
  (^java.lang.String [^UiConnectionInfo this]
    (-> this (.getFullAddress))))

