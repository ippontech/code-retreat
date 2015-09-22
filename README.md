# code-retreat machine provsioning

Machine provisioning for Ippon's Code Retreat

## Requirements

- VirtualBox
- Vagrant
- Ansible

## Setting up the VM

Install Ansible roles:

```
ansible-galaxy install -r requirements.yml -p roles --force
```

Build the VM:

```
vagrant up
```
