SUMMARY = "OpenDreambox: Base Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} += " \
  dreambox-vm-settings \
  killall \
  parted \
  procps \
  tpmd \
  tuxbox-common \
  tzdata \
  tzdata-europe \
  xfsprogs-mkfs \
  libssl3 \
  libusb1 \
  ${@base_version_less_or_equal('OLDEST_KERNEL', '3.9', '', 'kernel-module-wireguard wireguard-tools', d)} \
"

RRECOMMENDS_${PN} += " \
  autofs \
  avahi-daemon \
  bash \
  bash-completion \
  bash-completion-extra \
  dccamd \
  dreambox-compat \
  dropbear \
  e2fsprogs-e2fsck \
  haveged \
  hdstandby \
  htop \
  joe \
  less \
  mc \
  nano \
  samba-base \
  vsftpd \
  zeroconf \
"
