Revisar despues de reiniciar el nas 1. Reinicia tu NAS cuando te venga bien.  
    Después, revisa si las reglas se cargaron:
    
    `iptables -L -n | grep 10.66 iptables -t nat -L -n | grep 10.66 sysctl net.ipv4.ip_forward`
    
    Si todo está bien, verás tus reglas metidas y el `ip_forward=1`.