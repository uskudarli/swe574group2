# Introduction #

The following guidelines may be used to connect to VPN of CMPE; vpn.cmpe.boun.edu.tr.


# Details #

**For All Platforms**

  1. Acquire Cisco AnyConnect VPN Client for your platform.
  1. Provide your user credentials and the group name (cmpeall).
  1. Accept the certificate.
  1. You should be connected to the VPN and able to use ssh in order to access the group's account at the SWE server. (For details see _Instructions for SSH Connection_ in the wiki)

**For Unix Platforms**

  1. Install openconnect and vpnc if they are available for your platform.
  1. Get root access.
  1. Use openconnect with the vpnc script to connect to VPN. By default, vnpc's script is located at /etc/vpnc/vpnc-script. Use openconnect's "--script" option to utilize the script. Example usage: "`openconnect --script /etc/vpnc/vpnc-script vpn.cmpe.boun.edu.tr`"
  1. Accept the certificate.
  1. Provide the group name (cmpeall).
  1. Provide your user credentials.
  1. You should be connected to the VPN and able to use ssh in order to access the group's account at the SWE server. (For details see _Instructions for SSH Connection_ in the wiki)