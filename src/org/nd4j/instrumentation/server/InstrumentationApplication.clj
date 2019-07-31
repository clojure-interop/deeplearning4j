(ns org.nd4j.instrumentation.server.InstrumentationApplication
  "The instrumentation application"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.instrumentation.server InstrumentationApplication]))

(defn ->instrumentation-application
  "Constructor.

  resource-path - `java.lang.String`"
  (^InstrumentationApplication [^java.lang.String resource-path]
    (new InstrumentationApplication resource-path))
  (^InstrumentationApplication []
    (new InstrumentationApplication )))

(defn run
  "nd-4j-instrumentation-configuration - `org.nd4j.instrumentation.server.Nd4jInstrumentationConfiguration`
  environment - `io.dropwizard.setup.Environment`

  throws: java.lang.Exception"
  ([^InstrumentationApplication this ^org.nd4j.instrumentation.server.Nd4jInstrumentationConfiguration nd-4j-instrumentation-configuration ^io.dropwizard.setup.Environment environment]
    (-> this (.run nd-4j-instrumentation-configuration environment))))

(defn start
  "Start the server"
  ([^InstrumentationApplication this]
    (-> this (.start))))

(defn stop
  "Stop the server

  throws: java.lang.Exception"
  ([^InstrumentationApplication this]
    (-> this (.stop))))

