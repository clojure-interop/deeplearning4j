(ns org.deeplearning4j.spark.time.NTPTimeSource
  "A TimeSource that utilize Network Time Protocol to determine the system clock offset
 Instances should be obtained via getInstance() or TimeSourceProvider; one instance may be
 used per machine
 Specifically, the implementation uses Apache Commons Net (already a dependency in Spark) to query a NTP server.
 This querying is done periodically (default: once upon initialization and then every 30 minutes thereafter).
 The following configuration options can be set via system properties:
 To set the time update frequency (for querying the NTP server, in milliseconds): org.deeplearning4j.spark.time.NTPTimeSource.frequencyms
 To set the NTP server address: org.deeplearning4j.spark.time.NTPTimeSource.server
 Default NTP server: DEFAULT_NTP_SERVER"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.time NTPTimeSource]))

(def *-ntp-source-update-frequency-ms-property
  "Static Constant.

  Deprecated. Use DL4JSystemProperties.NTP_SOURCE_UPDATE_FREQUENCY_MS_PROPERTY

  type: java.lang.String"
  NTPTimeSource/NTP_SOURCE_UPDATE_FREQUENCY_MS_PROPERTY)

(def *-ntp-source-server-property
  "Static Constant.

  Deprecated. Use DL4JSystemProperties.NTP_SOURCE_SERVER_PROPERTY

  type: java.lang.String"
  NTPTimeSource/NTP_SOURCE_SERVER_PROPERTY)

(def *-max-query-retries
  "Static Constant.

  type: int"
  NTPTimeSource/MAX_QUERY_RETRIES)

(def *-default-ntp-timeout-ms
  "Static Constant.

  type: int"
  NTPTimeSource/DEFAULT_NTP_TIMEOUT_MS)

(def *-default-update-frequency
  "Static Constant.

  type: long"
  NTPTimeSource/DEFAULT_UPDATE_FREQUENCY)

(def *-min-update-frequency
  "Static Constant.

  type: long"
  NTPTimeSource/MIN_UPDATE_FREQUENCY)

(def *-default-ntp-server
  "Static Constant.

  type: java.lang.String"
  NTPTimeSource/DEFAULT_NTP_SERVER)

(defn *get-instance
  "returns: `org.deeplearning4j.spark.time.TimeSource`"
  (^org.deeplearning4j.spark.time.TimeSource []
    (NTPTimeSource/getInstance )))

(defn current-time-millis
  "Description copied from interface: TimeSource

  returns: Current time, since epoch - `long`"
  (^Long [^NTPTimeSource this]
    (-> this (.currentTimeMillis))))

