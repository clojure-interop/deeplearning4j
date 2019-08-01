(ns org.deeplearning4j.config.DL4JSystemProperties
  "DL4JSystemProperties class contains the system properties that can be used to configure various aspects of DL4J.
 See the javadoc of each property for details"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.config DL4JSystemProperties]))

(def *-dl-4-j-resources-dir-property
  "Static Constant.

  Applicability: Numerous modules, including deeplearning4j-datasets and deeplearning4j-zoo
  Description: Used to set the local location for downloaded remote resources such as datasets (like MNIST) and
  pretrained models in the model zoo. Default value is set via new File(System.getProperty(\"user.home\"), \".deeplearning4j\").
  Setting this can be useful if the system drive has limited space/performance, a shared location for all users
  should be used instead, or if user.home isn't set for some reason.

  type: java.lang.String"
  DL4JSystemProperties/DL4J_RESOURCES_DIR_PROPERTY)

(def *-dl-4-j-resources-base-url-property
  "Static Constant.

  Applicability: Numerous modules, including deeplearning4j-datasets and deeplearning4j-zoo
  Description: Used to set the base URL for hosting of resources such as datasets (like MNIST) and pretrained
  models in the model zoo. This is provided as a fallback in case the location of these files changes; it
  also allows for (in principle) a local mirror of these files.
  NOTE: Changing this to a location without the same files and file structure as the DL4J resource hosting is likely
  to break external resource dowloading in DL4J!

  type: java.lang.String"
  DL4JSystemProperties/DL4J_RESOURCES_BASE_URL_PROPERTY)

(def *-custom-registration-property
  "Static Constant.

  Applicability: deeplearning4j-nn
  Description: Used for loading legacy format JSON containing custom layers. This system property is provided as an
  alternative to NeuralNetConfiguration#registerLegacyCustomClassesForJSON(Class[]). Classes are specified in
  comma-separated format.
  This is required ONLY when ALL of the following conditions are met:
  1. You want to load a serialized net, saved in 1.0.0-alpha or before, AND
  2. The serialized net has a custom Layer, GraphVertex, etc (i.e., one not defined in DL4J), AND
  3. You haven't already called NeuralNetConfiguration#registerLegacyCustomClassesForJSON(Class[])

  type: java.lang.String"
  DL4JSystemProperties/CUSTOM_REGISTRATION_PROPERTY)

(def *-crash-dump-enabled-property
  "Static Constant.

  Applicability: deeplearning4j-nn
  Description: DL4J writes some crash dumps to disk when an OOM exception occurs - this functionality is enabled
  by default. This is to help users identify the cause of the OOM - i.e., where native memory is actually consumed.
  This system property can be used to disable memory crash reporting.

  type: java.lang.String"
  DL4JSystemProperties/CRASH_DUMP_ENABLED_PROPERTY)

(def *-crash-dump-output-directory-property
  "Static Constant.

  Applicability: deeplearning4j-nn
  Description: DL4J writes some crash dumps to disk when an OOM exception occurs - this functionality is enabled
  by default. This system property can be use to customize the output directory for memory crash reporting. By default,
  the current working directory (System.getProperty(\"user.dir\") or new File(\"\")) will be used

  type: java.lang.String"
  DL4JSystemProperties/CRASH_DUMP_OUTPUT_DIRECTORY_PROPERTY)

(def *-chart-max-points-property
  "Static Constant.

  Applicability: deeplearning4j-ui_2.xx
  Description: The DL4J training UI (StatsListener  UIServer.getInstance().attach(ss)) will subsample the number
  of chart points when a lot of data is present - i.e., only a maximum number of points will be shown on each chart.
  This is to reduce the UI bandwidth requirements and client-side rendering cost.
  To increase the number of points in charts, set this property to a larger value. Default: 512 values

  type: java.lang.String"
  DL4JSystemProperties/CHART_MAX_POINTS_PROPERTY)

(def *-ui-server-port-property
  "Static Constant.

  Applicability: deeplearning4j-play (deeplearning4j-ui_2.xx)
  Description: This property sets the port that the UI will be available on. Default port: 9000.
  Set to 0 for a random port.

  type: java.lang.String"
  DL4JSystemProperties/UI_SERVER_PORT_PROPERTY)

(def *-ntp-source-server-property
  "Static Constant.

  Applicability: dl4j-spark_2.xx - NTPTimeSource class (mainly used in ParameterAveragingTrainingMaster when stats
  collection is enabled; not enabled by default)
  Description: This sets the NTP (network time protocol) server to be used when collecting stats. Default: 0.pool.ntp.org

  type: java.lang.String"
  DL4JSystemProperties/NTP_SOURCE_SERVER_PROPERTY)

(def *-ntp-source-update-frequency-ms-property
  "Static Constant.

  Applicability: dl4j-spark_2.xx - NTPTimeSource class (mainly used in ParameterAveragingTrainingMaster when stats
  collection is enabled; not enabled by default)
  Description: This sets the NTP (network time protocol) update frequency in milliseconds. Default: 1800000 (30 minutes)

  type: java.lang.String"
  DL4JSystemProperties/NTP_SOURCE_UPDATE_FREQUENCY_MS_PROPERTY)

(def *-timesource-classname-property
  "Static Constant.

  Applicability: dl4j-spark_2.xx - mainly used in ParameterAveragingTrainingMaster when stats collection is enabled;
  not enabled by default
  Description: This sets the time source to use for spark stats. Default: org.deeplearning4j.spark.time.NTPTimeSource

  type: java.lang.String"
  DL4JSystemProperties/TIMESOURCE_CLASSNAME_PROPERTY)

