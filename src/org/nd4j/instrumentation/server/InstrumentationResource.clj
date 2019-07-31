(ns org.nd4j.instrumentation.server.InstrumentationResource
  "Instrumentation resource"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.instrumentation.server InstrumentationResource]))

(defn ->instrumentation-resource
  "Constructor."
  (^InstrumentationResource []
    (new InstrumentationResource )))

(defn get-num-alive
  "returns: `javax.ws.rs.core.Response`"
  (^javax.ws.rs.core.Response [^InstrumentationResource this]
    (-> this (.getNumAlive))))

(defn get-num-dead
  "returns: `javax.ws.rs.core.Response`"
  (^javax.ws.rs.core.Response [^InstrumentationResource this]
    (-> this (.getNumDead))))

(defn get-alive
  "returns: `javax.ws.rs.core.Response`"
  (^javax.ws.rs.core.Response [^InstrumentationResource this]
    (-> this (.getAlive))))

(defn is-alive
  "id - `java.lang.String`

  returns: `javax.ws.rs.core.Response`"
  (^javax.ws.rs.core.Response [^InstrumentationResource this ^java.lang.String id]
    (-> this (.isAlive id))))

(defn get-dead
  "returns: `javax.ws.rs.core.Response`"
  (^javax.ws.rs.core.Response [^InstrumentationResource this]
    (-> this (.getDead))))

