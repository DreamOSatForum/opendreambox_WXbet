SUMMARY = "bdremux - a blu-ray movie stream remuxer"
SECTION = "multimedia"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=374d7e305a3d05bc98bec47c241f02af"
DEPENDS = "gstreamer1.0"
SRCREV = "${@opendreambox_srcrev('8e3faf7fe16eb38bb80dd668e5e9070397bfe84a', d)}"

inherit autotools opendreambox-git pkgconfig
