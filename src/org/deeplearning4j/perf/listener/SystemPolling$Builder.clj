(ns org.deeplearning4j.perf.listener.SystemPolling$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.perf.listener SystemPolling$Builder]))

(defn ->builder
  "Constructor."
  (^SystemPolling$Builder []
    (new SystemPolling$Builder )))

(defn name-provider
  "The name provider for this SystemPolling
  the default value for this is a simple UUID

  name-provider - the name provider to use - `org.deeplearning4j.perf.listener.SystemPolling$NameProvider`

  returns: `org.deeplearning4j.perf.listener.SystemPolling$Builder`"
  (^org.deeplearning4j.perf.listener.SystemPolling$Builder [^SystemPolling$Builder this ^org.deeplearning4j.perf.listener.SystemPolling$NameProvider name-provider]
    (-> this (.nameProvider name-provider))))

(defn poll-every-millis
  "The interval in milliseconds in which to poll
  the system for diagnostics

  poll-every-millis - the interval in milliseconds - `long`

  returns: `org.deeplearning4j.perf.listener.SystemPolling$Builder`"
  (^org.deeplearning4j.perf.listener.SystemPolling$Builder [^SystemPolling$Builder this ^Long poll-every-millis]
    (-> this (.pollEveryMillis poll-every-millis))))

(defn output-directory
  "The output directory for the files

  output-directory - the output directory for the logs - `java.io.File`

  returns: `org.deeplearning4j.perf.listener.SystemPolling$Builder`"
  (^org.deeplearning4j.perf.listener.SystemPolling$Builder [^SystemPolling$Builder this ^java.io.File output-directory]
    (-> this (.outputDirectory output-directory))))

(defn build
  "returns: `org.deeplearning4j.perf.listener.SystemPolling`"
  (^org.deeplearning4j.perf.listener.SystemPolling [^SystemPolling$Builder this]
    (-> this (.build))))

